# test.py
import schemathesis

schema = schemathesis.from_path('./todo.yaml')
schema.base_url = 'http://localhost:8080'

@schema.parametrize()
def test_time(case):
    response = case.call()
    assert response.elapsed.total_seconds() < 1