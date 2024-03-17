package com.xlhl.template.generate;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * StaticGenerate
 * 静态文件生成器
 *
 * @author xlhl
 * @date 2024/3/7 14:57
 */
public class StaticGenerate {
    public static void main(String[] args) {
        String sourcePath = System.getProperty("user.dir") + File.separator + "generate-basic" + File.separator;
        System.out.println(sourcePath);
        String path = sourcePath;
        doGenerate(sourcePath, path, false);
    }

    /**
     * 使用 Hutool 工具包将源文件复制到目标路径
     *
     * @param source   源文件
     * @param path     目标路径
     * @param override 是否覆盖
     */
    public static void doGenerate(String source, String path, boolean override) {
        FileUtil.copy(source, path, override);

    }
}