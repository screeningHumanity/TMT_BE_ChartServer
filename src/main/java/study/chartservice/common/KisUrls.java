package study.chartservice.common;

import lombok.Getter;

@Getter
public enum KisUrls {
	BASE_URL("https://openapi.koreainvestment.com:9443"),
	TOKEN_PATH("/oauth2/tokenP"),
	ITEM_CHART_PRICE_PATH("/uapi/domestic-stock/v1/quotations/inquire-daily-itemchartprice");

	private final String path;

	KisUrls(String path) {
		this.path = path;
	}

	public String getFullUrl() {
		return BASE_URL.path + this.path;
	}
}
