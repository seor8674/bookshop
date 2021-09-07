package toy.pro.shop.web.review.dto.RequestDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class ReviewRequestDto {

    @ApiModelProperty(value = "리뷰 제목", notes = "리뷰 제목을 입력해주세요.", required = true)
    @NotBlank(message = "리뷰 제목을 입력해주세요.")
    private String title;

    @ApiModelProperty(value = "리뷰 내용", notes = "리뷰 내용을 입력해주세요.", required = true)
    @NotBlank(message = "리뷰 내용을 입력해주세요.")
    private String content;

    @Builder
    public ReviewRequestDto(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
}