import android.text.TextUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.portal.PortalUtils;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.vip.DownloadListener;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.qphone.base.util.QLog;
import cooperation.photoplus.PhotoPlusManager;
import java.util.concurrent.ConcurrentHashMap;

public class ydj
  extends DownloadListener
{
  public ydj(PhotoPlusManager paramPhotoPlusManager, String paramString1, String paramString2, String paramString3)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCancel(DownloadTask paramDownloadTask)
  {
    PhotoPlusManager.a(this.jdField_a_of_type_CooperationPhotoplusPhotoPlusManager).remove(this.jdField_a_of_type_JavaLangString);
  }
  
  public void onDone(DownloadTask paramDownloadTask)
  {
    PhotoPlusManager.a(this.jdField_a_of_type_CooperationPhotoplusPhotoPlusManager).remove(this.jdField_a_of_type_JavaLangString);
    if (paramDownloadTask.a() == 3)
    {
      if (QLog.isColorLevel()) {
        QLog.d("PhotoPlusManager", 2, "[onDone] download finished " + this.b);
      }
      if (TextUtils.isEmpty(this.c)) {
        this.jdField_a_of_type_CooperationPhotoplusPhotoPlusManager.a(this.jdField_a_of_type_JavaLangString);
      }
    }
    while (!QLog.isColorLevel())
    {
      return;
      paramDownloadTask = PortalUtils.a(this.jdField_a_of_type_JavaLangString);
      if (this.c.equalsIgnoreCase(paramDownloadTask))
      {
        this.jdField_a_of_type_CooperationPhotoplusPhotoPlusManager.a(this.jdField_a_of_type_JavaLangString);
        return;
      }
      if (QLog.isColorLevel()) {
        QLog.d("PhotoPlusManager", 2, "[onDone] checkMd5 failed: " + this.jdField_a_of_type_JavaLangString);
      }
      FileUtils.d(this.jdField_a_of_type_JavaLangString);
      return;
    }
    QLog.d("PhotoPlusManager", 2, "[onDone] downloadFile failed: " + paramDownloadTask.b + " code=" + paramDownloadTask.z);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\ydj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */