package com.wjl.spring.day03;

import org.joda.time.DateTime;

public class NextDayDateDisplayer {
    /**
     * NextDayDateDisplayer所声明的依赖dateOfNextDay的类型为DateTime，而不是
     * NextDayDateFactoryBean。也就是说FactoryBean类型的bean定义，通过正常的id引用，容器返回
     * 的是FactoryBean所“生产”的对象类型，而非FactoryBean实现本身
     */

    private DateTime dateOfNextDay;

    public DateTime getDateOfNextDay() {
        return dateOfNextDay;
    }

    public void setDateOfNextDay(DateTime dateOfNextDay) {
        this.dateOfNextDay = dateOfNextDay;
    }
}