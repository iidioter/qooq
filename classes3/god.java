import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.av.smallscreen.SmallScreenDialogActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class god
  implements DialogInterface.OnClickListener
{
  public god(SmallScreenDialogActivity paramSmallScreenDialogActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a();
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\god.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */