# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "http://py-trees.readthedocs.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "py_trees"
ROS_BPN = "py_trees"

ROS_BUILD_DEPENDS = " \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-enum34 \
    python-pydot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/melodic/py_trees/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "591a512c55a301a91a69ec7d019c6b0e"
SRC_URI[sha256sum] = "f0749de4867ee89d353aa9ba22338ec73044a05e186ee0d611caa917fc708c4d"
S = "${WORKDIR}/py_trees-release-release-melodic-py_trees-0.6.8-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('py-trees', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('py-trees', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/py-trees_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/py-trees-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
