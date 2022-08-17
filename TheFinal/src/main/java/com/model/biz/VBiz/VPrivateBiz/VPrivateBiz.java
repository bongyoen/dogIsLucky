package com.model.biz.VBiz.VPrivateBiz;

import java.util.List;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayMethodDto;



public interface VPrivateBiz {
	public int insertPayHis();
	public PayMethodDto getPayMethod(int usrid);
	List<DiagnosisDto> searchAllDiagno();
	DiagnosisDto selectOneDiagno();
}
