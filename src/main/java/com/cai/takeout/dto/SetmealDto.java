package com.cai.takeout.dto;

import com.cai.takeout.entity.Setmeal;
import com.cai.takeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
