package tencent.im.new_year_2014;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class PackServer$SetPackUsedReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBoolField external = PBField.initBool(false);
  public final PBBytesField pack_id = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "pack_id", "external" }, new Object[] { localByteStringMicro, Boolean.valueOf(false) }, SetPackUsedReq.class);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\new_year_2014\PackServer$SetPackUsedReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */