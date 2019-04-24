# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Visualization for the XPP Motion Framework."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/leggedrobotics/xpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "xpp"
ROS_BPN = "xpp_vis"

ROS_BUILD_DEPENDS = " \
    kdl-parser \
    robot-state-publisher \
    roscpp \
    tf \
    visualization-msgs \
    xpp-msgs \
    xpp-states \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    kdl-parser \
    robot-state-publisher \
    roscpp \
    tf \
    visualization-msgs \
    xpp-msgs \
    xpp-states \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    kdl-parser \
    robot-state-publisher \
    roscpp \
    tf \
    visualization-msgs \
    xpp-msgs \
    xpp-states \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_vis/1.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bb25e529519ab3ee7d8ea18def26b03b"
SRC_URI[sha256sum] = "a28dddd1ac40ec97257e52ee5f1dc6b2a0989fcf0fceccba4698019bbcfe56e7"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_vis-1.0.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('xpp', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('xpp', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/xpp_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/xpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/xpp/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
