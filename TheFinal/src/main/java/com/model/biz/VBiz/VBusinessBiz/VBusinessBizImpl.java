package com.model.biz.VBiz.VBusinessBiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.dao.VDao.VBusinessBiz.VBusinessDao;
import com.model.dto.DiagnosisDto;
import com.model.dto.PayHistoryDto;
import com.model.dto.VBookDto;

public class VBusinessBizImpl implements VBusinessBiz{
	@Autowired
	private VBusinessDao dao;

	@Override
	public List<VBookDto> selectBook() {
		// TODO Auto-generated method stub
		return dao.selectBook();
	}

	@Override
	public List<PayHistoryDto> selectHistory() {
		// TODO Auto-generated method stub
		return dao.selectPayHistory();
	}

	@Override
	public List<DiagnosisDto> selectDiagnosis() {
		// TODO Auto-generated method stub
		return dao.selectDiagnosis();
	}

	@Override
	public int updateTimeTable() {
		// TODO Auto-generated method stub
		return dao.updateTimeTable();
	}

	@Override
	public int insertDiagnosis() {
		// TODO Auto-generated method stub
		return dao.insertDiagnosis();
	}

	@Override
	public int insertPayHistoryDto() {
		// TODO Auto-generated method stub
		return dao.insertPayHistoryDto();
	}

	@Override
	public int insertVBookDto() {
		// TODO Auto-generated method stub
		return dao.insertVBookDto();
	}

	@Override
	public int updateDiagnosis() {
		// TODO Auto-generated method stub
		return dao.updateDiagnosis();
	}

	@Override
	public int updatePayHistoryDto() {
		// TODO Auto-generated method stub
		return dao.updatePayHistoryDto();
	}

	@Override
	public int updateVBookDto() {
		// TODO Auto-generated method stub
		return dao.updateVBookDto();
	}

	@Override
	public int deleteDiagnosis() {
		// TODO Auto-generated method stub
		return dao.deleteDiagnosis();
	}

	@Override
	public int deletePayHistoryDto() {
		// TODO Auto-generated method stub
		return dao.deletePayHistoryDto();
	}

	@Override
	public int deleteVBookDto() {
		// TODO Auto-generated method stub
		return dao.deleteVBookDto();
	}

	@Override
	public int deleteInvoice() {
		// TODO Auto-generated method stub
		return dao.deleteInvoice();
	}
}
