package me.funnyzhao.mangostreet.api;

import me.funnyzhao.mangostreet.bean.Item;
import me.funnyzhao.mangostreet.bean.success.AddItemBody;
import me.funnyzhao.mangostreet.bean.success.DeleteItemBody;
import me.funnyzhao.mangostreet.bean.success.ItemResultBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by funnyzhao .
 * 物品数据请求API
 */

public interface ItemApi {
    /**
     * 通过用户获取发布物品的集合 || 获取所有物品集合
     * @return
     */
    @GET("classes/Item")
    Call<ItemResultBody> getItemByuserName();

    /**
     * 添加物品
     * @param item
     * @return
     */
    @POST("classes/Item")
    Call<AddItemBody> addnewItem(@Body Item item);


    /**
     * 删除物品
     * @param objectId
     * @return
     */
    @DELETE("classes/Item/{objectId}")
    Call<DeleteItemBody> deleteItem(@Path("objectId") String objectId);

}
