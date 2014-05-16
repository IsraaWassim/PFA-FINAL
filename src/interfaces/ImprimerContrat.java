package interfaces;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.io.File;

import javax.swing.JFrame;

import com.crystaldecisions.ReportViewer.ReportViewerBean;
import com.crystaldecisions.sdk.occa.report.application.OpenReportOptions;
import com.crystaldecisions.sdk.occa.report.application.ReportClientDocument;
import com.crystaldecisions.sdk.occa.report.lib.ReportSDKException;

public class ImprimerContrat extends JFrame {
String studNo,currentval;

private static final long serialVersionUID = 1L;

public static void imprimer( boolean onlyExport) { 
	try{

		ReportClientDocument reportClientDocument = new ReportClientDocument();
		reportClientDocument.setReportAppServer(ReportClientDocument.inprocConnectionString);
		reportClientDocument.open("doc\\Contrat.rpt", OpenReportOptions._openAsReadOnly);
		reportClientDocument.getDatabaseController().logon("postgres", "0000");
		
		ReportViewerBean reportViewerBean = new ReportViewerBean();
		reportViewerBean.init();
		reportViewerBean.setReportSource(reportClientDocument.getReportSource());
		reportViewerBean.start();
		//if(onlyExport)reportViewerBean.exportView(ReportViewerBean.toPDF, new File("D:/CdeClt"+numCdeClt+".pdf"));
		if(!onlyExport){
			ImprimerContrat frame = new ImprimerContrat();
			frame.getContentPane().add(reportViewerBean, BorderLayout.CENTER);
			frame.setExtendedState(Frame.MAXIMIZED_BOTH);
			frame.setLocationByPlatform(true);
			frame.setVisible(true);
		}
		
		
		
	}catch (ReportSDKException e){
		e.printStackTrace();
	}
	}

}