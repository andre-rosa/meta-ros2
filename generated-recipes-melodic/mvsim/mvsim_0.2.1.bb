# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Node for the &quot;multivehicle simulator&quot; framework."
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "http://wiki.ros.org/mvsim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mvsim"
ROS_BPN = "mvsim"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
    message-runtime \
    mrpt-bridge \
    mrpt1 \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
    message-runtime \
    mrpt-bridge \
    mrpt1 \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
    message-runtime \
    mrpt-bridge \
    mrpt1 \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ual-arm-ros-pkg-release/mvsim-release/archive/release/melodic/mvsim/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7114b3f51d9d10bc5dfa8e52dc56e939"
SRC_URI[sha256sum] = "341d75fa8e654806b77f439a1e82959974366382947ef70df434047c7680adca"
S = "${WORKDIR}/mvsim-release-release-melodic-mvsim-0.2.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mvsim', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mvsim', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mvsim/mvsim_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mvsim/mvsim-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mvsim/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mvsim/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
