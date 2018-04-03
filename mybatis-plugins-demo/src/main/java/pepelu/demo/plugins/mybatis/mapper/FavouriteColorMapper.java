package pepelu.demo.plugins.mybatis.mapper;

import pepelu.demo.plugins.mybatis.model.FavouriteColorModel;

/**
 * @author Pepe Lu
 */
public interface FavouriteColorMapper {
    int save(FavouriteColorModel favouriteColor);

    FavouriteColorModel get(Long userId);
}
