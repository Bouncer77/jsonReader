package pro.kosenkov.json_reader.dto.v2.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.Instant;

/**
* Omni от слова Омниканальность
* Омниканальность это стратегия в бизнесе, которая означает использование множества каналов связи с клиентом,
*  чтобы обеспечить наилучший уровень удобства и удовлетворения потребностей клиента.
*
* Короче доступ с телефона, браузера, через звонок менеджеру и тп
* */
@Data
public final class LroResponse<T> implements Serializable {

    public static final String STATUS = "ok";

    /**
     * Значащее поле ответа
     * Может быть список поэтому требуется использовать аннотацию JsonInclude
     */
    @Nullable
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private T data;

    /**
     * Статус ответа
     */
    @NonNull
    private String status;

    /**
     * Время формирования ответа
     */
    @NonNull
    private Instant currentTimestamp;

    protected LroResponse(@NonNull String status) {
        this(status, Instant.now());
    }

    protected LroResponse() {
        this(LroResponse.STATUS);
    }

    protected LroResponse(@NonNull String status, @NonNull Instant currentTimestamp) {
        this.status = status;
        this.currentTimestamp = currentTimestamp;
    }
}