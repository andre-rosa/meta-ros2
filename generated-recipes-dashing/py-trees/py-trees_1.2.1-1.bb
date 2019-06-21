# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "http://py-trees.readthedocs.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "py_trees"
ROS_BPN = "py_trees"

ROS_BUILD_DEPENDS = " \
    python3-setuptools \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-pydot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-nose \
    python3-nose-yanc \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/dashing/py_trees/1.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "70dcb7ec2d3e8d75154146d069a094bc"
SRC_URI[sha256sum] = "56e3d153bfdd6d82e1adf99af6570a521f23faf71c79fa1a0e14a9450b8abd7d"
S = "${WORKDIR}/py_trees-release-release-dashing-py_trees-1.2.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('py-trees', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('py-trees', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/py-trees_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/py-trees-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/py-trees/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}