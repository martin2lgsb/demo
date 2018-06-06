# -*- coding: utf-8 -*-
import xlrd
import xlwt
from xlutils.copy import copy
import math


if __name__ == '__main__':
    rb = xlrd.open_workbook("./结算表.xlsx")
    wb = copy(rb)
    sheet_names = rb.sheet_names()

    ways = {
        # 分类 | 区段 | 初始值 | 步长
        1111: [100, 1.5, 0.5],
        1112: [200, 2.4, 0.8],
        1113: [800, 3, 1],
    }

    sheet = rb.sheet_by_index(0)
    count_row = 0
    for row in sheet.get_rows():
        x1 = int(row[0].value) if isinstance(row[0].value, float) else 0
        x2 = int(row[1].value) if isinstance(row[1].value, float) else 0
        if x1*x2 != 0 and ways.__contains__(x1):
            res = x2 * (math.ceil(x2/ways[x1][0] - 1) * ways[x1][2] + ways[x1][1])
            wr = wb.get_sheet(0)
            wr.write(count_row, 2, res)
        count_row += 1
    wb.save("./计算结果.xlsx")