package jyani.hoshiyar.dao;

import java.util.List;

import jyani.hoshiyar.dto.Mobile;
import jyani.hoshiyar.exception.NoRecordFoundException;
import jyani.hoshiyar.exception.SomethingWentWrongException;

public interface MobileDAO {

	public void AddMobile(Mobile mob) throws SomethingWentWrongException;

	public void UpdateMobileUsingModalNo(Mobile mob) throws SomethingWentWrongException;

	public void DeleteMobileUsingModalNo(String modal_no) throws SomethingWentWrongException;

	public List<Mobile> ViewAllMobiles() throws NoRecordFoundException, SomethingWentWrongException;

	public List<Mobile> SearchMobileByModelNo(String modal_no) throws NoRecordFoundException, SomethingWentWrongException;

	public List<Mobile> SearchMobileByPriceRange(int p1,int p2) throws NoRecordFoundException, SomethingWentWrongException;

}
