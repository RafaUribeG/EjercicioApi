package com.rafaeluribe.ejercicioapi.retrofit

data class Divisa(
    val data: Data,
    val meta: Meta
)

data class Data(
    val AED: AED,
    val AFN: AFN,
    val ALL: ALL,
    val AMD: AMD,
    val ANG: ANG,
    val AOA: AOA,
    val ARS: ARS,
    val AUD: AUD,
    val AWG: AWG,
    val AZN: AZN,
    val BAM: BAM,
    val BBD: BBD,
    val BDT: BDT,
    val BGN: BGN,
    val BHD: BHD,
    val BIF: BIF,
    val BMD: BMD,
    val BND: BND,
    val BOB: BOB,
    val BRL: BRL,
    val BSD: BSD,
    val BTC: BTC,
    val BTN: BTN,
    val BWP: BWP,
    val BYN: BYN,
    val BYR: BYR,
    val BZD: BZD,
    val CAD: CAD,
    val CDF: CDF,
    val CHF: CHF,
    val CLF: CLF,
    val CLP: CLP,
    val CNY: CNY,
    val COP: COP,
    val CRC: CRC,
    val CUC: CUC,
    val CUP: CUP,
    val CVE: CVE,
    val CZK: CZK,
    val DJF: DJF,
    val DKK: DKK,
    val DOP: DOP,
    val DZD: DZD,
    val EGP: EGP,
    val ETB: ETB,
    val EUR: EUR,
    val FJD: FJD,
    val GBP: GBP,
    val GEL: GEL,
    val GHS: GHS,
    val GMD: GMD,
    val GNF: GNF,
    val GTQ: GTQ,
    val GYD: GYD,
    val HKD: HKD,
    val HNL: HNL,
    val HRK: HRK,
    val HTG: HTG,
    val HUF: HUF,
    val IDR: IDR,
    val ILS: ILS,
    val INR: INR,
    val IQD: IQD,
    val IRR: IRR,
    val ISK: ISK,
    val JMD: JMD,
    val JOD: JOD,
    val JPY: JPY,
    val KES: KES,
    val KGS: KGS,
    val KHR: KHR,
    val KMF: KMF,
    val KRW: KRW,
    val KWD: KWD,
    val KYD: KYD,
    val KZT: KZT,
    val LAK: LAK,
    val LBP: LBP,
    val LKR: LKR,
    val LRD: LRD,
    val LSL: LSL,
    val LTL: LTL,
    val LVL: LVL,
    val LYD: LYD,
    val MAD: MAD,
    val MDL: MDL,
    val MGA: MGA,
    val MKD: MKD,
    val MMK: MMK,
    val MOP: MOP,
    val MRO: MRO,
    val MUR: MUR,
    val MVR: MVR,
    val MWK: MWK,
    val MXN: MXN,
    val MYR: MYR,
    val MZN: MZN,
    val NAD: NAD,
    val NGN: NGN,
    val NIO: NIO,
    val NOK: NOK,
    val NPR: NPR,
    val NZD: NZD,
    val OMR: OMR,
    val PAB: PAB,
    val PEN: PEN,
    val PGK: PGK,
    val PHP: PHP,
    val PKR: PKR,
    val PLN: PLN,
    val PYG: PYG,
    val QAR: QAR,
    val RON: RON,
    val RSD: RSD,
    val RUB: RUB,
    val RWF: RWF,
    val SAR: SAR,
    val SBD: SBD,
    val SCR: SCR,
    val SDG: SDG,
    val SEK: SEK,
    val SGD: SGD,
    val SHP: SHP,
    val SLL: SLL,
    val SOS: SOS,
    val SRD: SRD,
    val STD: STD,
    val SVC: SVC,
    val SZL: SZL,
    val THB: THB,
    val TJS: TJS,
    val TMT: TMT,
    val TND: TND,
    val TOP: TOP,
    val TRY: TRY,
    val TTD: TTD,
    val TWD: TWD,
    val TZS: TZS,
    val UAH: UAH,
    val UGX: UGX,
    val USD: USD,
    val UYU: UYU,
    val UZS: UZS,
    val VND: VND,
    val XAF: XAF,
    val XCD: XCD,
    val XDR: XDR,
    val XOF: XOF,
    val XPF: XPF,
    val YER: YER,
    val ZAR: ZAR,
    val ZMK: ZMK,
    val ZMW: ZMW,
    val ZWL: ZWL
)

data class Meta(
    val last_updated_at: String
)

data class AED(
    val code: String,
    val value: Double
)

data class AFN(
    val code: String,
    val value: Double
)

data class ALL(
    val code: String,
    val value: Double
)

data class AMD(
    val code: String,
    val value: Double
)

data class ANG(
    val code: String,
    val value: Double
)

data class AOA(
    val code: String,
    val value: Double
)

data class ARS(
    val code: String,
    val value: Double
)

data class AUD(
    val code: String,
    val value: Double
)

data class AWG(
    val code: String,
    val value: Double
)

data class AZN(
    val code: String,
    val value: Double
)

data class BAM(
    val code: String,
    val value: Double
)

data class BBD(
    val code: String,
    val value: Double
)

data class BDT(
    val code: String,
    val value: Double
)

data class BGN(
    val code: String,
    val value: Double
)

data class BHD(
    val code: String,
    val value: Double
)

data class BIF(
    val code: String,
    val value: Double
)

data class BMD(
    val code: String,
    val value: Double
)

data class BND(
    val code: String,
    val value: Double
)

data class BOB(
    val code: String,
    val value: Double
)

data class BRL(
    val code: String,
    val value: Double
)

data class BSD(
    val code: String,
    val value: Double
)

data class BTC(
    val code: String,
    val value: Double
)

data class BTN(
    val code: String,
    val value: Double
)

data class BWP(
    val code: String,
    val value: Double
)

data class BYN(
    val code: String,
    val value: Double
)

data class BYR(
    val code: String,
    val value: Int
)

data class BZD(
    val code: String,
    val value: Double
)

data class CAD(
    val code: String,
    val value: Double
)

data class CDF(
    val code: String,
    val value: Double
)

data class CHF(
    val code: String,
    val value: Double
)

data class CLF(
    val code: String,
    val value: Double
)

data class CLP(
    val code: String,
    val value: Double
)

data class CNY(
    val code: String,
    val value: Double
)

data class COP(
    val code: String,
    val value: Double
)

data class CRC(
    val code: String,
    val value: Double
)

data class CUC(
    val code: String,
    val value: Double
)

data class CUP(
    val code: String,
    val value: Double
)

data class CVE(
    val code: String,
    val value: Double
)

data class CZK(
    val code: String,
    val value: Double
)

data class DJF(
    val code: String,
    val value: Double
)

data class DKK(
    val code: String,
    val value: Double
)

data class DOP(
    val code: String,
    val value: Double
)

data class DZD(
    val code: String,
    val value: Double
)

data class EGP(
    val code: String,
    val value: Double
)

data class ETB(
    val code: String,
    val value: Double
)

data class EUR(
    val code: String,
    val value: Double
)

data class FJD(
    val code: String,
    val value: Double
)

data class GBP(
    val code: String,
    val value: Double
)

data class GEL(
    val code: String,
    val value: Double
)

data class GHS(
    val code: String,
    val value: Double
)

data class GMD(
    val code: String,
    val value: Double
)

data class GNF(
    val code: String,
    val value: Double
)

data class GTQ(
    val code: String,
    val value: Double
)

data class GYD(
    val code: String,
    val value: Double
)

data class HKD(
    val code: String,
    val value: Double
)

data class HNL(
    val code: String,
    val value: Double
)

data class HRK(
    val code: String,
    val value: Double
)

data class HTG(
    val code: String,
    val value: Double
)

data class HUF(
    val code: String,
    val value: Double
)

data class IDR(
    val code: String,
    val value: Double
)

data class ILS(
    val code: String,
    val value: Double
)

data class INR(
    val code: String,
    val value: Double
)

data class IQD(
    val code: String,
    val value: Double
)

data class IRR(
    val code: String,
    val value: Double
)

data class ISK(
    val code: String,
    val value: Double
)

data class JMD(
    val code: String,
    val value: Double
)

data class JOD(
    val code: String,
    val value: Double
)

data class JPY(
    val code: String,
    val value: Double
)

data class KES(
    val code: String,
    val value: Double
)

data class KGS(
    val code: String,
    val value: Double
)

data class KHR(
    val code: String,
    val value: Double
)

data class KMF(
    val code: String,
    val value: Double
)

data class KRW(
    val code: String,
    val value: Double
)

data class KWD(
    val code: String,
    val value: Double
)

data class KYD(
    val code: String,
    val value: Double
)

data class KZT(
    val code: String,
    val value: Double
)

data class LAK(
    val code: String,
    val value: Double
)

data class LBP(
    val code: String,
    val value: Double
)

data class LKR(
    val code: String,
    val value: Double
)

data class LRD(
    val code: String,
    val value: Double
)

data class LSL(
    val code: String,
    val value: Double
)

data class LTL(
    val code: String,
    val value: Double
)

data class LVL(
    val code: String,
    val value: Double
)

data class LYD(
    val code: String,
    val value: Double
)

data class MAD(
    val code: String,
    val value: Double
)

data class MDL(
    val code: String,
    val value: Double
)

data class MGA(
    val code: String,
    val value: Double
)

data class MKD(
    val code: String,
    val value: Double
)

data class MMK(
    val code: String,
    val value: Double
)

data class MOP(
    val code: String,
    val value: Double
)

data class MRO(
    val code: String,
    val value: Double
)

data class MUR(
    val code: String,
    val value: Double
)

data class MVR(
    val code: String,
    val value: Double
)

data class MWK(
    val code: String,
    val value: Double
)

data class MXN(
    val code: String,
    val value: Double
)

data class MYR(
    val code: String,
    val value: Double
)

data class MZN(
    val code: String,
    val value: Double
)

data class NAD(
    val code: String,
    val value: Double
)

data class NGN(
    val code: String,
    val value: Double
)

data class NIO(
    val code: String,
    val value: Double
)

data class NOK(
    val code: String,
    val value: Double
)

data class NPR(
    val code: String,
    val value: Double
)

data class NZD(
    val code: String,
    val value: Double
)

data class OMR(
    val code: String,
    val value: Double
)

data class PAB(
    val code: String,
    val value: Double
)

data class PEN(
    val code: String,
    val value: Double
)

data class PGK(
    val code: String,
    val value: Double
)

data class PHP(
    val code: String,
    val value: Double
)

data class PKR(
    val code: String,
    val value: Double
)

data class PLN(
    val code: String,
    val value: Double
)

data class PYG(
    val code: String,
    val value: Double
)

data class QAR(
    val code: String,
    val value: Double
)

data class RON(
    val code: String,
    val value: Double
)

data class RSD(
    val code: String,
    val value: Double
)

data class RUB(
    val code: String,
    val value: Double
)

data class RWF(
    val code: String,
    val value: Double
)

data class SAR(
    val code: String,
    val value: Double
)

data class SBD(
    val code: String,
    val value: Double
)

data class SCR(
    val code: String,
    val value: Double
)

data class SDG(
    val code: String,
    val value: Double
)

data class SEK(
    val code: String,
    val value: Double
)

data class SGD(
    val code: String,
    val value: Double
)

data class SHP(
    val code: String,
    val value: Double
)

data class SLL(
    val code: String,
    val value: Double
)

data class SOS(
    val code: String,
    val value: Double
)

data class SRD(
    val code: String,
    val value: Double
)

data class STD(
    val code: String,
    val value: Double
)

data class SVC(
    val code: String,
    val value: Double
)

data class SZL(
    val code: String,
    val value: Double
)

data class THB(
    val code: String,
    val value: Double
)

data class TJS(
    val code: String,
    val value: Double
)

data class TMT(
    val code: String,
    val value: Double
)

data class TND(
    val code: String,
    val value: Double
)

data class TOP(
    val code: String,
    val value: Double
)

data class TRY(
    val code: String,
    val value: Double
)

data class TTD(
    val code: String,
    val value: Double
)

data class TWD(
    val code: String,
    val value: Double
)

data class TZS(
    val code: String,
    val value: Double
)

data class UAH(
    val code: String,
    val value: Double
)

data class UGX(
    val code: String,
    val value: Double
)

data class USD(
    val code: String,
    val value: Int
)

data class UYU(
    val code: String,
    val value: Double
)

data class UZS(
    val code: String,
    val value: Double
)

data class VND(
    val code: String,
    val value: Double
)

data class XAF(
    val code: String,
    val value: Double
)

data class XCD(
    val code: String,
    val value: Double
)

data class XDR(
    val code: String,
    val value: Double
)

data class XOF(
    val code: String,
    val value: Double
)

data class XPF(
    val code: String,
    val value: Double
)

data class YER(
    val code: String,
    val value: Double
)

data class ZAR(
    val code: String,
    val value: Double
)

data class ZMK(
    val code: String,
    val value: Double
)

data class ZMW(
    val code: String,
    val value: Double
)

data class ZWL(
    val code: String,
    val value: Double
)