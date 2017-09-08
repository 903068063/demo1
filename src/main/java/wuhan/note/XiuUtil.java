package wuhan.note;

import java.io.File;

import wuhan.note.util.file.ExlceUtil;

public class XiuUtil {
	/**
	 * mop品牌修复sql拼接
	 * @param filepath
	 */
	public void mopBrandUpdate(String filepath) {
		// update xiu_mop.X_MOP_GOODS g set
		// BRAND_NAME='Burberry',BRAND_CODE='UK0015' where g.xiu_code
		// ='73044177';
		String a1 = "update xiu_mop.X_MOP_GOODS g set BRAND_NAME='";
		String s1 = "";
		String a2 = "',BRAND_CODE='";
		String s2 = "";
		String a3 = "' where g.xiu_code ='";
		String s3 = "";
		String a4 = "';";
		try {
			File file = new File(filepath);
			String[][] result = ExlceUtil.getData(file, 1);
			int rowLength = result.length;
			for (int i = 0; i < rowLength; i++) {
				for (int j = 0; j < result[i].length; j++) {
					String data = result[i][j];
					switch (j) {
					case 0:// 走秀码
						s3 = data;
						break;
					case 1:// 梳理后代码
						s2 = data;
						break;
					case 2:// 梳理后品牌名称
						s1 = data;
						break;
					default:
						break;
					}
				}
				System.out.println(a1 + s1 + a2 + s2 + a3 + s3 + a4);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
