package handler;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.context.CellWriteHandlerContext;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

import java.util.List;

/**
 * @Author lvmh
 * @Date 2023/9/1 16:19
 * @PackageName:handler
 * @ClassName: ContentStyleHandler
 * @Description: TODO
 * @Version 1.0
 */
public class ContentStyleHandler extends LongestMatchColumnWidthStyleStrategy {
    @Override
    public void afterCellDispose(CellWriteHandlerContext context) {
        contentStyle(context.getCell());
    }

    private void contentStyle(Cell cell){
        CellStyle cellStyle = cell.getSheet().getWorkbook().createCellStyle();
        if(cell.getColumnIndex()==3){
            cellStyle.setLocked(false);
            cell.setCellStyle(cellStyle);
        }else {
            cellStyle.setLocked(true);
            cell.setCellStyle(cellStyle);

        }
        System.out.println(cell.getColumnIndex());



    }
}
