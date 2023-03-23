package jyani.hoshiyar.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jyani.hoshiyar.dto.Mobile;
import jyani.hoshiyar.dto.MobileImpl;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void AddMobile(Mobile mob) throws SomethingWentWrongException {
		Connection con = null;

		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "INSERT INTO mobile (model_no, company, price, MFGdate) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, mob.getModel_no());
			ps.setString(2, mob.getCompany());
			ps.setInt(3, mob.getPrice());
			ps.setDate(4, Date.valueOf(mob.getMFGdate()));

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable To Insert this Record! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void UpdateMobileUsingModalNo(Mobile mob) throws SomethingWentWrongException {
		Connection con = null;

		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "UPDATE mobile SET company = ?, price = ?, MFGdate = ? WHERE model_no = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, mob.getCompany());
			ps.setInt(2, mob.getPrice());
			ps.setDate(3, Date.valueOf(mob.getMFGdate()));
			ps.setString(4, mob.getModel_no());

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable To Update this Mobile Record! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void DeleteMobileUsingModalNo(String model_no) throws SomethingWentWrongException {
		Connection con = null;

		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "DELETE FROM mobile WHERE model_no = '" + model_no + "'";
			PreparedStatement ps = con.prepareStatement(query);

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Unable To Delete this Model! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<Mobile> ViewAllMobiles() throws SomethingWentWrongException, NoRecordFoundException {
		List<Mobile> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "SELECT * FROM mobile";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Mobiles found");
			}
			while (rs.next()) {
				list.add(new MobileImpl(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5).toLocalDate()));
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! You Can't View Right now.Due to Some Error! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<Mobile> SearchMobileByModelNo(String model_no)
			throws NoRecordFoundException, SomethingWentWrongException {
		List<Mobile> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtils.getConnectionToDatabase();
			String query = "SELECT * FROM mobile WHERE model_no = '" + model_no + "'";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Mobile found");
			}
			while (rs.next()) {
				list.add(new MobileImpl(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5).toLocalDate()));
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! You Can't View Right now.Due to Some Error! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<Mobile> SearchMobileByPriceRange(int p1, int p2)
			throws NoRecordFoundException, SomethingWentWrongException {
		List<Mobile> list = new ArrayList<>();
		Connection con = null;
		try {

			con = DBUtils.getConnectionToDatabase();
			String query = "SELECT * FROM mobile WHERE price >= " + p1 + " AND price <= " + p2 + "";

			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtils.checkResultSet(rs)) {
				throw new NoRecordFoundException("No Mobile found");
			}
			while (rs.next()) {
				list.add(new MobileImpl(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5).toLocalDate()));
			}

		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! You Can't View Right now.Due to Some Error! Try Again later.");
		} finally {
			try {
				DBUtils.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

}
