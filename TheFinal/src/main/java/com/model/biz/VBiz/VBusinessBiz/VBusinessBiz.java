package com.model.biz.VBiz.VBusinessBiz;

import java.util.List;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayHistoryDto;
import com.model.dto.VBookDto;




public interface VBusinessBiz {
	public List<VBookDto> selectBook();
	public List<PayHistoryDto> selectHistory();
	public List<DiagnosisDto> selectDiagnosis();
	public int updateTimeTable();
	
	public int insertDiagnosis();
	public int insertPayHistoryDto();
	public int insertVBookDto();
	
	public int updateDiagnosis();
	public int updatePayHistoryDto();
	public int updateVBookDto();
	
	
	public int deleteDiagnosis();
	public int deletePayHistoryDto();
	public int deleteVBookDto();
	
	public int deleteInvoice();
	

}
