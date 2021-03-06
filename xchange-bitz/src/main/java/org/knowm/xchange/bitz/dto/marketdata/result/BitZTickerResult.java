package org.knowm.xchange.bitz.dto.marketdata.result;

import org.knowm.xchange.bitz.dto.BitZResult;
import org.knowm.xchange.bitz.dto.marketdata.BitZTicker;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitZTickerResult extends BitZResult<BitZTicker> {

  public BitZTickerResult(
      @JsonProperty("code") int code,
      @JsonProperty("msg") String message,
      @JsonProperty("data") BitZTicker data) {
    super(code, message, data);
  }
}
