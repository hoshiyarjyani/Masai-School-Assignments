package com.dao;

import java.util.List;

import com.dto.DisplayCarDTO;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

public interface DisplayCarDAO {
	public List<DisplayCarDTO> DisplayCarDetails() throws SomethingWentWrongException, NoRecordFoundException;
}
