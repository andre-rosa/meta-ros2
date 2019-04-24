# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package is currently for internal use only. Its API may change     without warning in the future.  This package is deprecated."
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://www.ros.org/wiki/timestamp_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "driver_common"
ROS_BPN = "timestamp_tools"

ROS_BUILD_DEPENDS = " \
    roscpp \
    roslib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    roslib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    roslib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/timestamp_tools/1.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f8c4874d1e918fc14e3fc1d93eeed5d9"
SRC_URI[sha256sum] = "dabb75248bb8528c603d556f7533df6bf701870db84b5d5c5983e2d7f08464b0"
S = "${WORKDIR}/driver_common-release-release-melodic-timestamp_tools-1.6.8-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('driver-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('driver-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/driver-common/driver-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/driver-common/driver-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/driver-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/driver-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
