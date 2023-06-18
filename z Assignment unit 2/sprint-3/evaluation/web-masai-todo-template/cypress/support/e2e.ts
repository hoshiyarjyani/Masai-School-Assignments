// ***********************************************************
// This example support/e2e.ts is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'
// ensures that every test case only runs for a certain amount of time
const exitTestCaseAfter = 3; // mins
let timeoutId;
beforeEach(() => {
  timeoutId = setTimeout(() => {
    throw new Error("Test taking tooooo long!");
  }, exitTestCaseAfter * 60 * 1000);
});
afterEach(() => {
  clearTimeout(timeoutId);
});

// Alternatively you can use CommonJS syntax:
// require('./commands')
