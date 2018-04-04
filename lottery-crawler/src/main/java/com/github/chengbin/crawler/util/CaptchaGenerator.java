package com.github.chengbin.crawler.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;


/**
 * 获取随机验证码
 */
public enum CaptchaGenerator {

    INSTANCE;

    private static final int WIDTH = 160;
    private static final int HEIGHT = 68;
    private final String[] cnNumber = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    private String captcha; // 验证码
    private String expression; // 表达式

    public BufferedImage genImage() {
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB); // 在内存中创建图象

        Random random = new Random();
        Graphics2D g = initImage(image, random);

        int x = random.nextInt(10) + 1;
        int y = random.nextInt(20) + 10;
        if (y < x) y = x;

        switch (random.nextInt(7)) {
            case 1:
                this.setCaptcha(String.valueOf(y));
                this.setExpression("?  -  " + cnNumber[x] + " = " + getResultStr(y - x));
                break;
            case 2:
                this.setCaptcha(String.valueOf(y));
                this.setExpression(cnNumber[x] + " × ? = " + getResultStr(x * y));
                break;
            case 3:
                this.setCaptcha(String.valueOf(x + y));
                this.setExpression(cnNumber[x] + "  +  " + getResultStr(y) + " = ?");
                break;
            case 4:
                this.setCaptcha(String.valueOf(y - x));
                this.setExpression(getResultStr(y) + "  -  " + cnNumber[x] + " = ?");
                break;
            case 5:
                this.setCaptcha(String.valueOf(x * y));
                this.setExpression(cnNumber[x] + " × " + getResultStr(y) + " = ?");
                break;
            case 6:
                this.setCaptcha(String.valueOf(y * x));
                this.setExpression(getResultStr(y) + " × " + cnNumber[x] + " = ?");
                break;
            default:
                this.setCaptcha(String.valueOf(y));
                this.setExpression(cnNumber[x] + "  +  ? = " + getResultStr(x + y));
                break;
        }

        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));// 设定字体
        g.setColor(new Color(20 + random.nextInt(30), 20 + random.nextInt(120), 20 + random.nextInt(120)));
        randomPosition(g, random);
        g.dispose();// 图象生效

        return image;
    }

    /**
     * 随机定位
     *
     * @param g
     */
    private void randomPosition(Graphics2D g, Random random) {
        double theta = random.nextDouble() / 6;
        switch (random.nextInt(2)) {
            case 1:
                g.rotate(-theta);
                g.drawString(expression, 8, 48);
                break;
            default:
                g.rotate(theta);
                g.drawString(expression, 8, 24);
                break;
        }
    }

    private String getResultStr(int resultInt) {
        String resultStr;
        if (resultInt < 11) {
            resultStr = cnNumber[resultInt];
        } else {
            resultStr = String.valueOf(resultInt);
        }
        return resultStr;
    }

    /**
     * 初始化图片
     *
     * @param image
     * @param random
     * @return
     */
    public Graphics2D initImage(BufferedImage image, Random random) {
        Graphics2D g = (Graphics2D) image.getGraphics(); // 获取图形上下文
        g.setColor(getRandColor(200, 250));// 设定背景色
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 22));// 设定字体
        g.setColor(getRandColor(180, 200)); // 随机产生180条干扰线，使图象中的认证码不易被其它程序探测到
        for (int i = 0; i < 360; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int xl = random.nextInt(16);
            int yl = random.nextInt(16);
            g.drawLine(x, y, x + xl, y + yl);
        }
        return g;
    }

    /*
     * 给定范围获得随机颜色
     */
    private Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    /*
         * 取得图片的验证码
         */
    public String getCaptcha() {
        return this.captcha;
    }

    /*
     * 设置图片的验证码
     */
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}