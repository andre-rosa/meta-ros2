# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The rostwitter package"
AUTHOR = "k-okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "rostwitter"

ROS_BUILD_DEPENDS = " \
    git \
    mk \
    python-requests \
    python-requests-oauthlib \
    python-setuptools \
    python-simplejson \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-requests \
    python-requests-oauthlib \
    python-simplejson \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-requests \
    python-requests-oauthlib \
    python-simplejson \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rostwitter/2.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "87e9d311519cdcd5c9ba2634806fca03"
SRC_URI[sha256sum] = "605b80b46c13909f8313ae2c0ab51d437f634af9d7aef578cb2bee9dea87cdae"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rostwitter-2.1.11-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-3rdparty', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-3rdparty', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-3rdparty/jsk-3rdparty-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-3rdparty/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-3rdparty/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
