package com.model.biz.VBiz.VPrivateBiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.dao.VDao.VPrivateBiz.VPrivateDao;
import com.model.dto.DiagnosisDto;
import com.model.dto.PayMethodDto;

public class VPrivateBizImpl implements VPrivateBiz{
	
	@Autowired
	private VPrivateDao dao;
	@Override
	public int insertPayHis() {
		// TODO Auto-generated method stub
		return dao.insertPayHis();
	}

	@Override
	public PayMethodDto getPayMethod(int usrid) {
		// TODO Auto-generated method stub
		return dao.getPayMethod(usrid);
	}

	@Override
	public List<DiagnosisDto> searchAllDiagno() {
		// TODO Auto-generated method stub
		return dao.searchAllDiagno();
	}

	@Override
	public DiagnosisDto selectOneDiagno() {
		// TODO Auto-generated method stub
		return dao.selectOneDiagno();
	}
}
