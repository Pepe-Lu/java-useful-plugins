package pepelu.demo.plugins.mybatis.model;

/**
 * @author Pepe Lu
 */
public class FavouriteColorModel {
    private Long id;
    private Long userId;
    private Color color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
