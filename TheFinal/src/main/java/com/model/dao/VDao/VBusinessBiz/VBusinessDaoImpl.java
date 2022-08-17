package com.model.dao.VDao.VBusinessBiz;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayHistoryDto;
import com.model.dto.VBookDto;

@Repository
public class VBusinessDaoImpl implements VBusinessDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<VBookDto> selectBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayHistoryDto> selectPayHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosisDto> selectDiagnosis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateTimeTable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertDiagnosis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertPayHistoryDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertVBookDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDiagnosis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePayHistoryDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVBookDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDiagnosis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePayHistoryDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteVBookDto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
