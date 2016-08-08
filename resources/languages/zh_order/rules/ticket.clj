(
  "ticket"
  #"机票|飞机票"
  {:dim :entity_ticket
   :entity :ticket}

  "ticket*"
  [(dim :word)]
  {:dim :entity_ticket
   :entity :ticket
   :pureword :pureword}

  ;"order <ticket>"
  ;[#"帮我订一张" (dim :entity_ticket)]
  ;{:dim :order_ticket
  ; :value [{:dim :order_ticket} %2 ] }

  "order <ticket>-"
  [(dim :word) (dim :entity_ticket)]
  {:dim :order_ticket
   :value [{:dim :order_ticket} %2 ]
   :matchwhole true}

  "order <ticket>*"
  [(dim :word)]
  {:dim :order_ticket
   :value [{:dim :order_ticket}]
   :pureword :pureword
   :matchwhole true}

  "cup"
  #"茶杯"
  {:dim :entity_cup
   :entity :cup}

  "cup*"
  [(dim :word)]
  {:dim :entity_cup
   :entity :ticket
   :pureword :pureword}

  "order <cup>"
  [#"帮我订一个" (dim :entity_cup)]
  {:dim :order_cup
   :value [{:dim :order_cup} %2 ]
   :matchwhole true}

  "order <cup>-"
  [(dim :word) (dim :entity_cup)]
  {:dim :order_cup
   :value [{:dim :order_cup} %2 ]
   :matchwhole true}

  "order <cup>*"
  [(dim :word)]
  {:dim :order_cup
   :value [{:dim :order_cup}]
   :pureword :pureword
   :matchwhole true}


)