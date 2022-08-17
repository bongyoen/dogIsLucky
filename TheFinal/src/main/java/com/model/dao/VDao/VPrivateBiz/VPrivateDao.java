package com.model.dao.VDao.VPrivateBiz;

import java.util.List;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayMethodDto;




public interface VPrivateDao {
	public int insertPayHis();
	public PayMethodDto getPayMethod(int usrid);
	public List<DiagnosisDto> searchAllDiagno();
	public DiagnosisDto selectOneDiagno();

}
