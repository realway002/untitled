package handler;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;

/**
 * @Author lvmh
 * @Date 2023/9/1 15:56
 * @PackageName:handler
 * @ClassName: CustomSheetHandler
 * @Description: TODO
 * @Version 1.0
 */
public class CustomSheetHandler  implements SheetWriteHandler {
    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        writeSheetHolder.getSheet().protectSheet("123456");
    }
}
