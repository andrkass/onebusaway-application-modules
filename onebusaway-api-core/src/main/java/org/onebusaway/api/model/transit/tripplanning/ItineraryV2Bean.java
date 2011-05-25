package org.onebusaway.api.model.transit.tripplanning;

import java.util.ArrayList;
import java.util.List;

public class ItineraryV2Bean {

  private long startTime;

  private long endTime;

  private double probability;

  private boolean selected;

  private List<LegV2Bean> legs = new ArrayList<LegV2Bean>();

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }

  public double getProbability() {
    return probability;
  }

  public void setProbability(double probability) {
    this.probability = probability;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }

  public List<LegV2Bean> getLegs() {
    return legs;
  }

  public void setLegs(List<LegV2Bean> legs) {
    this.legs = legs;
  }
}