package pepelu.demo.plugins.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pepelu.demo.plugins.mybatis.mapper.FavouriteColorMapper;
import pepelu.demo.plugins.mybatis.model.Color;
import pepelu.demo.plugins.mybatis.model.FavouriteColorModel;
import pepelu.plugins.mybatis.typehandler.MyBatisEnum;

/**
 * @author Pepe Lu
 */
@RestController
@RequestMapping("/favourite/color")
public class FavouriteColorController {
    @Autowired
    private FavouriteColorMapper favouriteColorMapper;

    @PostMapping("/save")
    public String save(Long userId, Integer color) {
        FavouriteColorModel favouriteColorModel = new FavouriteColorModel();
        favouriteColorModel.setColor(MyBatisEnum.codeOf(Color.class, color, Color.BLUE));
        favouriteColorModel.setUserId(userId);
        favouriteColorMapper.save(favouriteColorModel);
        return "success";
    }

    @GetMapping("/get")
    public String get(Long userId) {
        return favouriteColorMapper.get(userId).getColor().name();
    }
}
