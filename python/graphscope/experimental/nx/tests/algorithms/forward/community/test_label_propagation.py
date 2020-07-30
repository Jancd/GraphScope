import networkx.algorithms.community.tests.test_label_propagation
import pytest

from graphscope.experimental.nx.utils.compat import import_as_graphscope_nx

import_as_graphscope_nx(networkx.algorithms.community.tests.test_label_propagation,
                        decorators=pytest.mark.usefixtures("graphscope_session"))
