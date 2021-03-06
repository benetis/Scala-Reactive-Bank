package models

import play.api.libs.json.Json

/**
  * Created by kuba on 27.05.16.
  */
case class Transaction(from:Long, to:Long, title:String, cashAmount: BigDecimal)

object Transaction {
  implicit val writes = Json.writes[Transaction]
  implicit val reads = Json.reads[Transaction]
}
