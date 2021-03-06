package com.hoanglong.junadminstore.data.model.phone_product;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemPhoneProduct implements Parcelable {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("typeCategory")
    @Expose
    private String typeCategory;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("deal")
    @Expose
    private String deal;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("numberRating")
    @Expose
    private String numberRating;
    @SerializedName("titleH2")
    @Expose
    private String titleH2;
    @SerializedName("titleContent")
    @Expose
    private String titleContent;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("slider")
    @Expose
    private List<String> slider = null;
    @SerializedName("detailContent")
    @Expose
    private List<DetailContent> detailContent = null;
    @SerializedName("mParameter")
    @Expose
    private List<Parameter> mParameter = null;
    @SerializedName("listExtraProduct")
    @Expose
    private List<ListExtraProduct> listExtraProduct = null;
    @SerializedName("listSale")
    @Expose
    private List<String> listSale = null;
    @SerializedName("linkVideo")
    @Expose
    private String linkVideo;

    public ItemPhoneProduct() {
    }

    public ItemPhoneProduct(String type, String typeCategory, String title, String price,
                            String image, Integer rating, String numberRating, String titleH2,
                            String titleContent, List<String> slider, List<DetailContent> detailContent,
                            List<Parameter> parameter, List<String> listSale, String linkVideo) {
        this.type = type;
        this.typeCategory = typeCategory;
        this.title = title;
        this.price = price;
        this.image = image;
        this.rating = rating;
        this.numberRating = numberRating;
        this.titleH2 = titleH2;
        this.titleContent = titleContent;
        this.slider = slider;
        this.detailContent = detailContent;
        mParameter = parameter;
        this.listSale = listSale;
        this.linkVideo = linkVideo;
    }

    protected ItemPhoneProduct(Parcel in) {
        id = in.readString();
        type = in.readString();
        typeCategory = in.readString();
        title = in.readString();
        price = in.readString();
        deal = in.readString();
        image = in.readString();
        if (in.readByte() == 0) {
            rating = null;
        } else {
            rating = in.readInt();
        }
        numberRating = in.readString();
        titleH2 = in.readString();
        titleContent = in.readString();
        if (in.readByte() == 0) {
            v = null;
        } else {
            v = in.readInt();
        }
        slider = in.createStringArrayList();
        listSale = in.createStringArrayList();
        linkVideo = in.readString();
        mParameter = in.createTypedArrayList(Parameter.CREATOR);
        listExtraProduct = in.createTypedArrayList(ListExtraProduct.CREATOR);
        detailContent = in.createTypedArrayList(DetailContent.CREATOR);
    }



    private ItemPhoneProduct(ItemPhoneBuilder itemPhoneBuilder) {
        itemPhoneBuilder.id = id;
        itemPhoneBuilder.type = type;
        itemPhoneBuilder.typeCategory = typeCategory;
        itemPhoneBuilder.title = title;
        itemPhoneBuilder.price = price;
        itemPhoneBuilder.deal = deal;
        itemPhoneBuilder.image = image;
        itemPhoneBuilder.rating =rating;
        itemPhoneBuilder.numberRating =numberRating;
        itemPhoneBuilder.titleH2=titleH2;
        itemPhoneBuilder.titleContent = titleContent;
        itemPhoneBuilder.v = v;
        itemPhoneBuilder.slider = null;
        itemPhoneBuilder.detailContent = detailContent;
        itemPhoneBuilder.mParameter = mParameter;
        itemPhoneBuilder.listExtraProduct = listExtraProduct;
        itemPhoneBuilder.listSale = listSale;
        itemPhoneBuilder.linkVideo=linkVideo;
    }

    public static class ItemPhoneBuilder {

        private String id;
        private String type;
        private String typeCategory;
        private String title;
        private String price;
        private String deal;
        private String image;
        private Integer rating;
        private String numberRating;
        private String titleH2;
        private String titleContent;
        private Integer v;
        private List<String> slider = null;
        private List<DetailContent> detailContent = null;
        private List<Parameter> mParameter = null;
        private List<ListExtraProduct> listExtraProduct = null;
        private List<String> listSale = null;
        private String linkVideo;

        public ItemPhoneBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public ItemPhoneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public ItemPhoneBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ItemPhoneBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public ItemPhoneBuilder setDeal(String deal) {
            this.deal = deal;
            return this;
        }

        public ItemPhoneBuilder setImage(String image) {
            this.image = image;
            return this;
        }

        public ItemPhoneBuilder setRating(Integer rating) {
            this.rating = rating;
            return this;
        }

        public ItemPhoneBuilder setNumberRating(String numberRating) {
            this.numberRating = numberRating;
            return this;
        }

        public ItemPhoneBuilder setTitleH2(String titleH2) {
            this.titleH2 = titleH2;
            return this;
        }

        public ItemPhoneBuilder setTitleContent(String titleContent) {
            this.titleContent = titleContent;
            return this;
        }

        public ItemPhoneBuilder setV(Integer v) {
            this.v = v;
            return this;
        }

        public ItemPhoneBuilder setSlider(List<String> slider) {
            this.slider = slider;
            return this;
        }

        public ItemPhoneBuilder setDetailContent(List<DetailContent> detailContent) {
            this.detailContent = detailContent;
            return this;
        }

        public ItemPhoneBuilder setParameter(List<Parameter> parameter) {
            this.mParameter = parameter;
            return this;
        }

        public ItemPhoneBuilder setListExtraProduct(List<ListExtraProduct> listExtraProduct) {
            this.listExtraProduct = listExtraProduct;
            return this;
        }

        public ItemPhoneBuilder setListSale(List<String> listSale) {
            this.listSale = listSale;
            return this;
        }

        public ItemPhoneBuilder setLinkVideo(String linkVideo) {
            this.linkVideo = linkVideo;
            return this;
        }

        public ItemPhoneBuilder setTypeCategory(String typeCategory) {
            this.typeCategory = typeCategory;
            return this;
        }

        public ItemPhoneProduct build() {
            return new ItemPhoneProduct(this);
        }
    }

    public static final Creator<ItemPhoneProduct> CREATOR = new Creator<ItemPhoneProduct>() {
        @Override
        public ItemPhoneProduct createFromParcel(Parcel in) {
            return new ItemPhoneProduct(in);
        }

        @Override
        public ItemPhoneProduct[] newArray(int size) {
            return new ItemPhoneProduct[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNumberRating() {
        return numberRating;
    }

    public void setNumberRating(String numberRating) {
        this.numberRating = numberRating;
    }

    public String getTitleH2() {
        return titleH2;
    }

    public void setTitleH2(String titleH2) {
        this.titleH2 = titleH2;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public List<String> getSlider() {
        return slider;
    }

    public void setSlider(List<String> slider) {
        this.slider = slider;
    }

    public List<DetailContent> getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(List<DetailContent> detailContent) {
        this.detailContent = detailContent;
    }

    public List<Parameter> getParameter() {
        return mParameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.mParameter = parameter;
    }

    public List<ListExtraProduct> getListExtraProduct() {
        return listExtraProduct;
    }

    public void setListExtraProduct(List<ListExtraProduct> listExtraProduct) {
        this.listExtraProduct = listExtraProduct;
    }

    public List<String> getListSale() {
        return listSale;
    }

    public void setListSale(List<String> listSale) {
        this.listSale = listSale;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(type);
        dest.writeString(typeCategory);
        dest.writeString(title);
        dest.writeString(price);
        dest.writeString(deal);
        dest.writeString(image);
        if (rating == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(rating);
        }
        dest.writeString(numberRating);
        dest.writeString(titleH2);
        dest.writeString(titleContent);
        if (v == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(v);
        }
        dest.writeStringList(slider);
        dest.writeStringList(listSale);
        dest.writeString(linkVideo);
        dest.writeTypedList(mParameter);
        dest.writeTypedList(listExtraProduct);
        dest.writeTypedList(detailContent);
    }

    @Override
    public String toString() {
        return "ItemPhoneProduct{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", typeCategory='" + typeCategory + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", deal='" + deal + '\'' +
                ", image='" + image + '\'' +
                ", rating=" + rating +
                ", numberRating='" + numberRating + '\'' +
                ", titleH2='" + titleH2 + '\'' +
                ", titleContent='" + titleContent + '\'' +
                ", v=" + v +
                ", slider=" + slider +
                ", detailContent=" + detailContent +
                ", mParameter=" + mParameter +
                ", listExtraProduct=" + listExtraProduct +
                ", listSale=" + listSale +
                ", linkVideo='" + linkVideo + '\'' +
                '}';
    }
}
