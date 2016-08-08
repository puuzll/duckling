(
  ; Context map
  {}

  "帮我订一张机票"
  "帮我订一张飞机票"
  (fn [_ token]
    (when-not
      (and
        (= :order_ticket (:dim token)))
      [(:dim token) :order]))


  "帮我订一个茶杯"
  (fn [_ token]
    (when-not
      (and
        (= :order_cup (:dim token)))
      [(:dim token) :order]))

  )
