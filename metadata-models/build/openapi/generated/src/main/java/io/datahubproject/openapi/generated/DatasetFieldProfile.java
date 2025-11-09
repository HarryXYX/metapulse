package io.datahubproject.openapi.generated;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.datahubproject.openapi.generated.Histogram;
import io.datahubproject.openapi.generated.Quantile;
import io.datahubproject.openapi.generated.ValueFrequency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.validation.constraints.*;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
/**
 * Stats corresponding to fields in a dataset
 */
@Schema(description = "Stats corresponding to fields in a dataset")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-04T23:27:37.210949+08:00[Asia/Shanghai]")
@Jacksonized @Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetFieldProfile   {

  @JsonProperty("fieldPath") @Builder.Default
  private String fieldPath = null;

  @JsonProperty("uniqueCount") @Builder.Default
  private Long uniqueCount = null;

  @JsonProperty("uniqueProportion") @Builder.Default
  private BigDecimal uniqueProportion = null;

  @JsonProperty("nullCount") @Builder.Default
  private Long nullCount = null;

  @JsonProperty("nullProportion") @Builder.Default
  private BigDecimal nullProportion = null;

  @JsonProperty("min") @Builder.Default
  private String min = null;

  @JsonProperty("max") @Builder.Default
  private String max = null;

  @JsonProperty("mean") @Builder.Default
  private String mean = null;

  @JsonProperty("median") @Builder.Default
  private String median = null;

  @JsonProperty("stdev") @Builder.Default
  private String stdev = null;

  @JsonProperty("quantiles") @Builder.Default
  @Valid
  private List<Quantile> quantiles = null;

  @JsonProperty("distinctValueFrequencies") @Builder.Default
  @Valid
  private List<ValueFrequency> distinctValueFrequencies = null;

  @JsonProperty("histogram") @Builder.Default
  private Histogram histogram = null;

  @JsonProperty("sampleValues") @Builder.Default
  @Valid
  private List<String> sampleValues = null;

  public DatasetFieldProfile fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Get fieldPath
   * @return fieldPath
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public DatasetFieldProfile uniqueCount(Long uniqueCount) {
    this.uniqueCount = uniqueCount;
    return this;
  }

  /**
   * Get uniqueCount
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return uniqueCount
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getUniqueCount() {
    return uniqueCount;
  }

  public void setUniqueCount(Long uniqueCount) {
    this.uniqueCount = uniqueCount;
  }

  public DatasetFieldProfile uniqueProportion(BigDecimal uniqueProportion) {
    this.uniqueProportion = uniqueProportion;
    return this;
  }

  /**
   * Get uniqueProportion
   * @return uniqueProportion
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getUniqueProportion() {
    return uniqueProportion;
  }

  public void setUniqueProportion(BigDecimal uniqueProportion) {
    this.uniqueProportion = uniqueProportion;
  }

  public DatasetFieldProfile nullCount(Long nullCount) {
    this.nullCount = nullCount;
    return this;
  }

  /**
   * Get nullCount
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return nullCount
   **/
  @Schema(description = "")
  
  @Min(-9223372036854775808L) @Max(9223372036854775807L)   public Long getNullCount() {
    return nullCount;
  }

  public void setNullCount(Long nullCount) {
    this.nullCount = nullCount;
  }

  public DatasetFieldProfile nullProportion(BigDecimal nullProportion) {
    this.nullProportion = nullProportion;
    return this;
  }

  /**
   * Get nullProportion
   * @return nullProportion
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getNullProportion() {
    return nullProportion;
  }

  public void setNullProportion(BigDecimal nullProportion) {
    this.nullProportion = nullProportion;
  }

  public DatasetFieldProfile min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   **/
  @Schema(description = "")
  
    public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public DatasetFieldProfile max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   **/
  @Schema(description = "")
  
    public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public DatasetFieldProfile mean(String mean) {
    this.mean = mean;
    return this;
  }

  /**
   * Get mean
   * @return mean
   **/
  @Schema(description = "")
  
    public String getMean() {
    return mean;
  }

  public void setMean(String mean) {
    this.mean = mean;
  }

  public DatasetFieldProfile median(String median) {
    this.median = median;
    return this;
  }

  /**
   * Get median
   * @return median
   **/
  @Schema(description = "")
  
    public String getMedian() {
    return median;
  }

  public void setMedian(String median) {
    this.median = median;
  }

  public DatasetFieldProfile stdev(String stdev) {
    this.stdev = stdev;
    return this;
  }

  /**
   * Get stdev
   * @return stdev
   **/
  @Schema(description = "")
  
    public String getStdev() {
    return stdev;
  }

  public void setStdev(String stdev) {
    this.stdev = stdev;
  }

  public DatasetFieldProfile quantiles(List<Quantile> quantiles) {
    this.quantiles = quantiles;
    return this;
  }

  public DatasetFieldProfile addQuantilesItem(Quantile quantilesItem) {
    if (this.quantiles == null) {
      this.quantiles = new ArrayList<>();
    }
    this.quantiles.add(quantilesItem);
    return this;
  }

  /**
   * Get quantiles
   * @return quantiles
   **/
  @Schema(description = "")
      @Valid
    public List<Quantile> getQuantiles() {
    return quantiles;
  }

  public void setQuantiles(List<Quantile> quantiles) {
    this.quantiles = quantiles;
  }

  public DatasetFieldProfile distinctValueFrequencies(List<ValueFrequency> distinctValueFrequencies) {
    this.distinctValueFrequencies = distinctValueFrequencies;
    return this;
  }

  public DatasetFieldProfile addDistinctValueFrequenciesItem(ValueFrequency distinctValueFrequenciesItem) {
    if (this.distinctValueFrequencies == null) {
      this.distinctValueFrequencies = new ArrayList<>();
    }
    this.distinctValueFrequencies.add(distinctValueFrequenciesItem);
    return this;
  }

  /**
   * Get distinctValueFrequencies
   * @return distinctValueFrequencies
   **/
  @Schema(description = "")
      @Valid
    public List<ValueFrequency> getDistinctValueFrequencies() {
    return distinctValueFrequencies;
  }

  public void setDistinctValueFrequencies(List<ValueFrequency> distinctValueFrequencies) {
    this.distinctValueFrequencies = distinctValueFrequencies;
  }

  public DatasetFieldProfile histogram(Histogram histogram) {
    this.histogram = histogram;
    return this;
  }

  /**
   * Get histogram
   * @return histogram
   **/
  @Schema(description = "")
  
    @Valid
    public Histogram getHistogram() {
    return histogram;
  }

  public void setHistogram(Histogram histogram) {
    this.histogram = histogram;
  }

  public DatasetFieldProfile sampleValues(List<String> sampleValues) {
    this.sampleValues = sampleValues;
    return this;
  }

  public DatasetFieldProfile addSampleValuesItem(String sampleValuesItem) {
    if (this.sampleValues == null) {
      this.sampleValues = new ArrayList<>();
    }
    this.sampleValues.add(sampleValuesItem);
    return this;
  }

  /**
   * Get sampleValues
   * @return sampleValues
   **/
  @Schema(description = "")
  
    public List<String> getSampleValues() {
    return sampleValues;
  }

  public void setSampleValues(List<String> sampleValues) {
    this.sampleValues = sampleValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetFieldProfile datasetFieldProfile = (DatasetFieldProfile) o;
    return Objects.equals(this.fieldPath, datasetFieldProfile.fieldPath) &&
        Objects.equals(this.uniqueCount, datasetFieldProfile.uniqueCount) &&
        Objects.equals(this.uniqueProportion, datasetFieldProfile.uniqueProportion) &&
        Objects.equals(this.nullCount, datasetFieldProfile.nullCount) &&
        Objects.equals(this.nullProportion, datasetFieldProfile.nullProportion) &&
        Objects.equals(this.min, datasetFieldProfile.min) &&
        Objects.equals(this.max, datasetFieldProfile.max) &&
        Objects.equals(this.mean, datasetFieldProfile.mean) &&
        Objects.equals(this.median, datasetFieldProfile.median) &&
        Objects.equals(this.stdev, datasetFieldProfile.stdev) &&
        Objects.equals(this.quantiles, datasetFieldProfile.quantiles) &&
        Objects.equals(this.distinctValueFrequencies, datasetFieldProfile.distinctValueFrequencies) &&
        Objects.equals(this.histogram, datasetFieldProfile.histogram) &&
        Objects.equals(this.sampleValues, datasetFieldProfile.sampleValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, uniqueCount, uniqueProportion, nullCount, nullProportion, min, max, mean, median, stdev, quantiles, distinctValueFrequencies, histogram, sampleValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetFieldProfile {\n");
    
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    uniqueCount: ").append(toIndentedString(uniqueCount)).append("\n");
    sb.append("    uniqueProportion: ").append(toIndentedString(uniqueProportion)).append("\n");
    sb.append("    nullCount: ").append(toIndentedString(nullCount)).append("\n");
    sb.append("    nullProportion: ").append(toIndentedString(nullProportion)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    stdev: ").append(toIndentedString(stdev)).append("\n");
    sb.append("    quantiles: ").append(toIndentedString(quantiles)).append("\n");
    sb.append("    distinctValueFrequencies: ").append(toIndentedString(distinctValueFrequencies)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
    sb.append("    sampleValues: ").append(toIndentedString(sampleValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}