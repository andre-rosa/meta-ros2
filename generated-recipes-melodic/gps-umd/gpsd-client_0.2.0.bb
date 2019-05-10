# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes     using the NavSatFix message"
AUTHOR = "Timo Roehling <timo.roehling@fkie.fraunhofer.de>"
ROS_AUTHOR = "Ken Tossell <ken@tossell.net>"
HOMEPAGE = "http://ros.org/wiki/gpsd_client"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gps_umd"
ROS_BPN = "gpsd_client"

ROS_BUILD_DEPENDS = " \
    gps-common \
    libgps \
    pkgconfig \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gpsd_client/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "409e5ac0d05cf08100955875f2598fde"
SRC_URI[sha256sum] = "fb72a43064b023d7be47f00194232ca28d92aea68d92e7b32d337bbe6cfda51c"
S = "${WORKDIR}/gps_umd-release-release-melodic-gpsd_client-0.2.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('gps-umd', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('gps-umd', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gps-umd/gps-umd_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gps-umd/gps-umd-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gps-umd/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gps-umd/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
