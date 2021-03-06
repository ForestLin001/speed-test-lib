/**
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2016 Bertrand Martel
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fr.bmartel.speedtest;

/**
 * Speed test report
 * <p/>
 * feature current report measurement for DOWNLOAD/UPLOAD
 *
 * @author Bertrand Martel
 */
public class SpeedTestReport {

    /**
     * current size of file to upload
     */
    private long temporaryPacketSize = 0;

    /**
     * total file size
     */
    private long totalPacketSize = 0;

    /**
     * transfer rate in octet/s
     */
    private float transferRateOctet = 0;

    /**
     * transfer rate in bit/s
     */
    private float transferRateBit = 0;

    /**
     * upload start time in millis since 1970
     */
    private long startTime = 0;

    /**
     * upload report time in millis since 1970
     */
    private long reportTime = 0;

    /**
     * speed test mode for this report
     */
    private SpeedTestMode speedTestMode = SpeedTestMode.NONE;

    /**
     * speed test progress in percent (%)
     */
    private float progressPercent;

    /**
     * number of request
     */
    private int requestNum;

    /**
     * Build Upload report
     *
     * @param speedTestMode       speed test mode (DOWNLOAD/UPLOAD)
     * @param progressPercent     speed test progress in percent (%)
     * @param startTime           upload start time in millis since 1970
     * @param reportTime          upload report time in millis since 1970
     * @param temporaryPacketSize current size of file to upload
     * @param totalPacketSize     total file size
     * @param transferRateOctet   transfer rate in octet/s
     * @param transferRateBit     transfer rate in bit/s
     * @param requestNum          number of request for this report
     */
    public SpeedTestReport(SpeedTestMode speedTestMode,
                           float progressPercent,
                           long startTime,
                           long reportTime,
                           long temporaryPacketSize,
                           long totalPacketSize,
                           float transferRateOctet,
                           float transferRateBit,
                           int requestNum) {
        this.speedTestMode = speedTestMode;
        this.progressPercent = progressPercent;
        this.startTime = startTime;
        this.reportTime = reportTime;
        this.temporaryPacketSize = temporaryPacketSize;
        this.totalPacketSize = totalPacketSize;
        this.transferRateOctet = transferRateOctet;
        this.transferRateBit = transferRateBit;
        this.requestNum = requestNum;
    }

    /**
     * get current file size
     *
     * @return packet size in bit
     */
    public float getTemporaryPacketSize() {
        return temporaryPacketSize;
    }

    /**
     * get total file size
     *
     * @return total file size in bit
     */
    public long getTotalPacketSize() {
        return totalPacketSize;
    }

    /**
     * get transfer rate in octet/s
     *
     * @return transfer rate in octet/s
     */
    public float getTransferRateOctet() {
        return transferRateOctet;
    }

    /**
     * get transfer rate in bit/s
     *
     * @return transfer rate in bit/s
     */
    public float getTransferRateBit() {
        return transferRateBit;
    }

    /**
     * get speed test start time
     *
     * @return start time timestamp (millis since 1970)
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * get current timestamp
     *
     * @return current timestamp for this report measurement (millis since 1970)
     */
    public long getReportTime() {
        return reportTime;
    }

    /**
     * get speed test mode (DOWNLOAD/UPLOAD)
     *
     * @return speed test mode
     */
    public SpeedTestMode getSpeedTestMode() {
        return speedTestMode;
    }

    /**
     * get speed test progress
     *
     * @return progress in %
     */
    public float getProgressPercent() {
        return progressPercent;
    }

    /**
     * get request num
     *
     * @return
     */
    public int getRequestNum() {
        return requestNum;
    }
}
