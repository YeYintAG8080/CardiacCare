package com.ictti.hbc.presentation.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ictti.hbc.business.entity.DailyRecord;
import com.ictti.hbc.business.entity.Patient;
import com.ictti.hbc.business.service.DailyRecordService;
import com.ictti.hbc.business.service.PatientService;
import com.ictti.hbc.presentation.form.NurseForm;

public class FileDownloadAction extends BaseAction {
	private DailyRecordService myDailyRecordService;
	private PatientService myPatientService;
	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public void setMyDailyRecordService(DailyRecordService myDailyRecordService) {
		this.myDailyRecordService = myDailyRecordService;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping) {
		NurseForm myform = (NurseForm) form;
		if (request.getParameter("frmDownload").equals("echocardiography")) {

			DailyRecord record = myDailyRecordService
					.getDailyRecordById(Integer.parseInt(request.getParameter("frmDailyRecordId")));
			String retrieve_file_path = record.getEchocardiography();
			File file = new File(retrieve_file_path);
			try {
				response.setContentType("APPLICATION/OCTET-STREAM");
				response.setHeader("Content-Disposition",
						"attachement;filename=" + file.getName());
				response.setHeader("Cache-Control", "no-cache");
				ServletOutputStream out_echocardiography = response.getOutputStream();

				FileInputStream fileInputStream = new FileInputStream(
						retrieve_file_path);

				/* InputStream in = file.get.getBinaryStream(); */
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = fileInputStream.read(buffer)) != -1) {
					out_echocardiography.write(buffer, 0, n);
				}
				fileInputStream.close();
				out_echocardiography.close();
				out_echocardiography.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			/*myform.setFrmLinkControl("1");
			myform.setFrmDailyRecord(record);
			return "gotoMedicalRecordDetailForm";*/
		} else if (request.getParameter("frmDownload").equals(
				"electrocardiography")) {

			DailyRecord record = myDailyRecordService
					.getDailyRecordById(Integer.parseInt(request.getParameter("frmDailyRecordId")));
			 
			String retrieve_file_path = record.getElectrocardigraphy();
			
			File file = new File(retrieve_file_path);
			try {
				response.setContentType("APPLICATION/OCTET-STREAM");
				response.setHeader("Content-Disposition",
						"attachement;filename=" + file.getName());
				response.setHeader("Cache-Control", "no-cache");
				ServletOutputStream out_electrocardiography = response.getOutputStream();

				FileInputStream fileInputStream = new FileInputStream(
						retrieve_file_path);

				/* InputStream in = file.get.getBinaryStream(); */
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = fileInputStream.read(buffer)) != -1) {
					out_electrocardiography.write(buffer, 0, n);
				}
				fileInputStream.close();
				out_electrocardiography.close();
				out_electrocardiography.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			/*myform.setFrmLinkControl("1");
			myform.setFrmDailyRecord(record);
			return "gotoMedicalRecordDetailForm";*/
		}else if (request.getParameter("frmDownload").equals(
				"bloodtest")) {

			DailyRecord record = myDailyRecordService
					.getDailyRecordById(Integer.parseInt(request.getParameter("frmDailyRecordId")));
			String retrieve_file_path = record.getBloodTest();
			File file = new File(retrieve_file_path);
			try {
				response.setContentType("APPLICATION/OCTET-STREAM");
				response.setHeader("Content-Disposition",
						"attachement;filename=" + file.getName());
				response.setHeader("Cache-Control", "no-cache");
				ServletOutputStream out_bloodtest = response.getOutputStream();

				FileInputStream fileInputStream = new FileInputStream(
						retrieve_file_path);

				/* InputStream in = file.get.getBinaryStream(); */
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = fileInputStream.read(buffer)) != -1) {
					out_bloodtest.write(buffer, 0, n);
				}
				fileInputStream.close();
				out_bloodtest.close();
				out_bloodtest.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			/*myform.setFrmLinkControl("1");
			myform.setFrmDailyRecord(record);
			return "gotoMedicalRecordDetailForm";*/
		}else if (request.getParameter("frmDownload").equals(
				"updatelabresult")) {
			Patient patient=myPatientService.getPatientInfoDetailById(Integer.parseInt(request.getParameter("patientId")));
			String retrieve_file_path = patient.getUpdateLabResult();
			File file = new File(retrieve_file_path);
			try {
				response.setContentType("APPLICATION/OCTET-STREAM");
				response.setHeader("Content-Disposition",
						"attachement;filename=" + file.getName());
				response.setHeader("Cache-Control", "no-cache");
				ServletOutputStream out = response.getOutputStream();

				FileInputStream fileInputStream = new FileInputStream(
						retrieve_file_path);

				/* InputStream in = file.get.getBinaryStream(); */
				byte[] buffer = new byte[1000];
				int n = 0;
				while ((n = fileInputStream.read(buffer)) != -1) {
					out.write(buffer, 0, n);
				}
				fileInputStream.close();
				out.close();
				out.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;

		
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response, ActionMapping mapping)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
