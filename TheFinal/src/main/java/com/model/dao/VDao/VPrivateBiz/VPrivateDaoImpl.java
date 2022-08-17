package com.model.dao.VDao.VPrivateBiz;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayMethodDto;

@Repository
public class VPrivateDaoImpl implements VPrivateDao{
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertPayHis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PayMethodDto getPayMethod(int usrid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiagnosisDto> searchAllDiagno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiagnosisDto selectOneDiagno() {
		// TODO Auto-generated method stub
		return null;
	}

}
