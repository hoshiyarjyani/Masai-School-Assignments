import "cypress-localstorage-commands";
import data from "../../submissionData.json"; // do not create this file
// let data = [{ submission_link: "http://localhost:8080/", id: 67890 }];

// import { start, submitData } from "../../../data";
const Data = [
  {
    name: "R",
    type: "Assignment",
    date: "2020-01-01",
    priority: "Low",
  },
  {
    name: "R1",
    type: "Evaluation",
    date: "2020-01-01",
    priority: "Medium",
  },
  {
    name: "R3",
    type: "Quiz",
    date: "2020-01-01",
    priority: "Urgent",
  },
];
describe("Test", function () {
  let acc_score = 1;

  data.map(({ submission_link: url, id }) => {
    if (url.charAt(url.length - 1) != "/") {
      url = url + "/";
    }

    function FormSubmit(data, score, LSLen) {
      cy.get("#name").clear().type(data.name);
      cy.get("#type").select(data.type);
      cy.get("#date").clear().type(data.date);
      cy.get("#priority").select(data.priority);
      cy.get("form")
        .submit()
        .should(() => {
          expect(JSON.parse(localStorage.getItem("tasks")).length).to.equal(
            LSLen
          );
        })
        .then(() => {
          acc_score += score;
        });
    }

    function CheckTable(data, score, index) {
      cy.get("tr").eq(index).contains("td", data.name);
      cy.get("tr").eq(index).contains("td", data.type);
      cy.get("tr").eq(index).contains("td", data.date);
      cy.get("tr")
        .eq(index)
        .contains("td", data.priority)
        .then(() => {
          acc_score += score;
        });
    }

    function navigation(text) {
      cy.get("#nav").contains("a", text).click();
    }
    beforeEach(() => {
      cy.restoreLocalStorage();
    });

    afterEach(() => {
      cy.saveLocalStorage();
    });
    if (url && url.length) {
      // url = modifyUrl(url);
      it(`Form Submit is Working Fine`, () => {
        cy.visit(url);
        FormSubmit(Data[0], 1, 1);
      }); // Score:- 1
      it(`Check the Data after mutiple form submits`, () => {
        FormSubmit(Data[1], 0.5, 2);
        FormSubmit(Data[2], 0.5, 3);
      }); // Score:- 1
      it(`Check the Table`, () => {
        CheckTable(Data[0], 2 / 3, 1);
        CheckTable(Data[1], 2 / 3, 2);
        CheckTable(Data[2], 2 / 3, 3);
      }); // Score:- 2

      it(`Click on the Completed of the 2nd and 3rd element and check the deleting`, () => {
        cy.get("tbody tr")
          .eq(2)
          .children("td")
          .eq(4)
          .click()
          .then(() => {
            cy.get("tbody tr")
              .should("have.length", 2)
              .then(() => {
                acc_score += 0.5;
              });
          });
        cy.get("tbody tr")
          .eq(1)
          .children("td")
          .eq(4)
          .click()
          .then(() => {
            cy.get("tbody tr")
              .should("have.length", 1)
              .then(() => {
                acc_score += 0.5;
              });
          });
      }); // 1
      it(`Visit the Completed page and check the Table`, () => {
        navigation("Completed Tasks");
        CheckTable(Data[2], 0.5, 1);
        CheckTable(Data[1], 0.5, 2);
      }); // 1
      it(`Check the Filter Part`, () => {
        cy.get("select").select("Urgent");
        CheckTable(Data[2], 1, 1);
        cy.reload();
      }); // Score:-1
      it(`Add Tasks to Favourites and check the Deleting`, () => {
        cy.get("tbody tr").eq(0).children("td").eq(4).click();
        cy.get("tbody tr")
          .should("have.length", 1)
          .then(() => {
            acc_score += 1;
          });
      }); // Score:- 1
      it(`Visit Favourites Page and Check Table`, () => {
        navigation("Favourites");
        CheckTable(Data[2], 1, 1);
      }); // Score:- 1
    }

    it(`generate score`, () => {
      //////////////
      let result = {
        id,
        marks: Math.floor(acc_score),
      };
      result = JSON.stringify(result);
      cy.writeFile("results.json", `\n${result},`, { flag: "a+" }, (err) => {
        if (err) {
          console.error(err);
        }
      });
      //////////////////
    });
  });
});
