package tencent.im.cs.cmd0x383;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x383$ApplyCreateFolderRspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 88, 96 }, new String[] { "str_folder_path", "bool_safe_check_flag", "uint32_safe_check_res" }, new Object[] { "", Boolean.valueOf(false), Integer.valueOf(0) }, ApplyCreateFolderRspBody.class);
  public final PBBoolField bool_safe_check_flag = PBField.initBool(false);
  public final PBStringField str_folder_path = PBField.initString("");
  public final PBUInt32Field uint32_safe_check_res = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x383\cmd0x383$ApplyCreateFolderRspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */