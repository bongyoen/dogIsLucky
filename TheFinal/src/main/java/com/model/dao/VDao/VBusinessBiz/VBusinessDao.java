package com.model.dao.VDao.VBusinessBiz;

import java.util.List;

import com.model.dto.DiagnosisDto;
import com.model.dto.PayHistoryDto;
import com.model.dto.VBookDto;



public interface VBusinessDao {
	List<VBookDto> selectBook();
	List<PayHistoryDto> selectPayHistory();
	List<DiagnosisDto> selectDiagnosis();
	int updateTimeTable();
	
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
