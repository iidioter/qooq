import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.biz.pubaccount.subscript.SubscriptFeedsActivity;
import com.tencent.biz.pubaccount.subscript.SubscriptRecommendController;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import java.lang.ref.WeakReference;
import mqq.os.MqqHandler;

public class iel
  implements View.OnClickListener
{
  public iel(SubscriptRecommendController paramSubscriptRecommendController)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "P_CliOper", "Pb_account_lifeservice", "", "0X8005733", "0X8005733", 0, 0, "", "", "", "");
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X8006430", "0X8006430", 0, 0, "", "", "", "");
    this.a.jdField_a_of_type_Boolean = false;
    this.a.jdField_a_of_type_AndroidWidgetImageButton.setEnabled(false);
    ThreadManager.b().post(new iem(this));
    if (this.a.g == 1) {
      SubscriptRecommendController.a(this.a);
    }
    do
    {
      do
      {
        return;
      } while (this.a.g != 3);
      paramView = this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(SubscriptFeedsActivity.class);
    } while ((paramView == null) || (this.a.jdField_a_of_type_JavaLangRefWeakReference.get() == null) || (!(this.a.jdField_a_of_type_JavaLangRefWeakReference.get() instanceof SubscriptFeedsActivity)));
    paramView.sendEmptyMessage(1006);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\iel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */