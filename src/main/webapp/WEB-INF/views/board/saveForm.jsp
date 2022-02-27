<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">

	<form>
		<div class="form-group">
			<label for="title">제목:</label> 
			<input type="text" class="form-control" placeholder="제목을 입력해주세요." id="title">
		</div>

		<div class="form-group">
			<label for="content">글 입력:</label>
			<textarea class="form-control summernote" rows="5" id="content"></textarea>
		</div>
	</form>
	<button id="btn-save" class="btn btn-primary">글등록</button>
</div>

<script>
      $('.summernote').summernote({
        placeholder: '글을 작성해 주세요.',
        tabsize: 2,
        height: 300
      });
    </script>
    
<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>


