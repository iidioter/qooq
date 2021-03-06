package tencent.im.msg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_msg_body$MarketFace
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_ext_info = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_face_id = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_face_name = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_key = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_mobileparam = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_param = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_face_info = PBField.initUInt32(0);
  public final PBUInt32Field uint32_image_height = PBField.initUInt32(0);
  public final PBUInt32Field uint32_image_width = PBField.initUInt32(0);
  public final PBUInt32Field uint32_item_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_media_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sub_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_tab_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro6 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 24, 34, 40, 48, 58, 66, 72, 80, 88, 98, 106 }, new String[] { "bytes_face_name", "uint32_item_type", "uint32_face_info", "bytes_face_id", "uint32_tab_id", "uint32_sub_type", "bytes_key", "bytes_param", "uint32_media_type", "uint32_image_width", "uint32_image_height", "bytes_mobileparam", "bytes_ext_info" }, new Object[] { localByteStringMicro1, Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro2, Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro3, localByteStringMicro4, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro5, localByteStringMicro6 }, MarketFace.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\msg\im_msg_body$MarketFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */