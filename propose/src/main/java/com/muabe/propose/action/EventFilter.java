package com.muabe.propose.action;

import java.lang.reflect.ParameterizedType;

/**
 * <br>捲土重來<br>
 *
 * @author 오재웅(JaeWoong - Oh)
 * @email markjmind@gmail.com
 * @since 2018-11-06
 */
class EventFilter {
    private String name;

    EventFilter(ActionPlugin<?> actionPlugin){
        ParameterizedType type = (ParameterizedType)actionPlugin.getClass().getGenericSuperclass();
        name = ((Class)type.getActualTypeArguments()[0]).getName();
    }

    boolean filter(Object event){
        return name.equals(event.getClass().getName());
    }
}
